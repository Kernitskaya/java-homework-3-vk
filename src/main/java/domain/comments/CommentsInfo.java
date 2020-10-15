package domain.comments;

enum STATE {
    INTERESTING, OLD, NEW
}

/*
    state - тип комментариев, по котором сортируем порядок отображения
    commentsCount - колисчество комментариев
    mainComment - первый отображаемый комментарий
    isStateVisible - предоставлена возможность выбрать тип сортировки или нет
 */
public class CommentsInfo {
    STATE state = STATE.INTERESTING;
    Comment mainComment;
    boolean isStateVisible;
}
