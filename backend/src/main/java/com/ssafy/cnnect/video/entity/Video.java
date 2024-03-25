package com.ssafy.cnnect.video.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "data")
@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Video {
    @Id
    private String id;
    private String video_id;
    private long category_id;
    private String video_name;
//    private int video_level;
    private String video_thumbnail;
    private String video_date;
    private List<String> senteceList;
//    private String full_script;

//    private List<String> wordList;

}
