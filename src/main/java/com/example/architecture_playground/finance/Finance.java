package com.example.architecture_playground.finance;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Finance {
    @Id
    private Long id;

    private Long report;

    private Long someOther;
}
