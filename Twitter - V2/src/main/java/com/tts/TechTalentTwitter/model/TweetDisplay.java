package com.tts.TechTalentTwitter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//we don't add the @Entity because this class has no need to be a table
public class TweetDisplay {

    private User user;
    private String message;
    private String date;
    private List<Tag> tags;

}
