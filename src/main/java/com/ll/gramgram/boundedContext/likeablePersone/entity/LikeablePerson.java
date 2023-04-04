package com.ll.gramgram.boundedContext.likeablePersone.entity;

import com.ll.gramgram.boundedContext.instaMember.entity.InstaMember;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class) // 아래 @CreateDate와 @LastModifiedDate가 작동하게 허용하는 것
@ToString
@Entity
@Getter
public class LikeablePerson {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @CreatedDate // 아래 칼럼에는 값이 자동으로 들어간다(insert할 때)
    private LocalDateTime createDate;

    @LastModifiedDate // 아래 칼럼에는 값이 자동으로 들어간다(업데이트 할 때마다)
    private LocalDateTime modifyDate;

    @ManyToOne
    private InstaMember fromInstaMember;
    private String fromInstaMemberUsername;

    @ManyToOne
    private InstaMember toInstaMember;
    private String toInstaMemberUsername;

    private int attractiveTypeCode;
}