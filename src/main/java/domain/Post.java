package domain;

import domain.actions.ActionOnPost;
import domain.actions.CallToAction;
import domain.comments.CommentsInfo;

public class Post {
    int id;
    String createdDate;
    boolean isBookmark;

    CommentsInfo commentsInfo;
    OwnerInfo ownerInfo;
    MediaInfo mediaInfo;
    CountersInfo countersInfo;

    ActionOnPost actionOnPost;
    CallToAction callToAction;
}
