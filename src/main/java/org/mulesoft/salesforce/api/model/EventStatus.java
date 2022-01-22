package org.mulesoft.salesforce.api.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventStatus {

    private String mulesoftEventReceived;
    private String mulesoftProcessedOn;
    private String mulesoftProcessedSuccess;


}
