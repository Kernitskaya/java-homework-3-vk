package domain.actions;

/*
    Информация об возможных действиях над постом
 */
enum TYPE {
    NOT_INTERESTING, SAVE_TO_BOOKMARKS, BAN, NOTIFY, DEFAULT
}
public class ActionOnPost {
    TYPE type = TYPE.DEFAULT;
    String actionName;
    boolean canPin;
    boolean canDelete;
    boolean canEdit;
}
