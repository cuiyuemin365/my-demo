package com.damin.spring.applicationevent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReRunData {

    private String className;
    private String methodName;
    private String eventClassName;
    private String payload;
}
