package com.sn.tasks.app.mongo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "Tasks")
public class Tasks {
    private String taskName;
    private String priority;
    private String status;
}
