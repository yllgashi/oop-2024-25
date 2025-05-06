package lecture56_object_logging;

import java.time.LocalDate;

public class Book {
    // attribtues (with logs)
    private int id;
    private String title;
    private String description;
    private int insertBy;// log
    private LocalDate insertDate;// log
    private int updateBy;// log
    private LocalDate updateDate;// log
    private String updateComment;// log

    public Book(int id, String title, String description, int insertBy) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.insertBy = insertBy;
        this.insertDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title, int updateBy, String comment) {
        this.title = title;
        this.updateBy = updateBy;
        this.updateDate = LocalDate.now();
        this.updateComment = comment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description, int updateBy, String comment) {
        this.description = description;
        this.updateBy = updateBy;
        this.updateDate = LocalDate.now();
        this.updateComment = comment;
    }

    public int getInsertBy() {
        return insertBy;
    }

    public LocalDate getInsertDate() {
        return insertDate;
    }

    public int getUpdateBy() {
        return updateBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public String getUpdateComment() {
        return updateComment;
    }
}
