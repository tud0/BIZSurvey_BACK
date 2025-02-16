package com.bipa.bizsurvey.domain.answer.domain;


import com.bipa.bizsurvey.domain.answer.enums.Correct;
import com.bipa.bizsurvey.domain.question.domain.Question;
import com.bipa.bizsurvey.global.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "answer")
public class Answer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long id;


    @Column(nullable = false)
    private String surveyAnswer;

    @Enumerated(EnumType.STRING)
    private Correct correct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
}
