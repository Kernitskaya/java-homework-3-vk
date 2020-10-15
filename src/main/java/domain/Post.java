package domain;

import domain.actions.ActionOnPost;
import domain.actions.CallToAction;
import domain.comments.CommentsInfo;
import domain.counters.CountersInfo;

enum TYPE{
    POST, COPY, REPLY, POST_PHONE, SUGGEST
}
public class Post {
    int id;
    int signerId;
    int postponedId;
    TYPE postType;
    boolean markedAsAds;
    String text;
    String createdDate;
    boolean isBookmark;

    CommentsInfo commentsInfo;
    OwnerInfo ownerInfo;
    MediaInfo mediaInfo;
    CountersInfo countersInfo;

    ActionOnPost actionOnPost;
    CallToAction callToAction;

    Geo geo;
}
