package org.mulesoft.salesforce.session;

import lombok.*;

@Getter
@Setter
@ToString
public class Session {

    public static int sourceRecordsCount = 0;
    public static int targetRecordsCount = 0;

}
