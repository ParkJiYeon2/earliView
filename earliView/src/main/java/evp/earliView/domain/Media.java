package evp.earliView.domain;

import javax.persistence.*;

@Table
@Entity //JPA에서 사용한 Entity class, 테이블과 링크될 클래스
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mediaNum;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "content", length = 4000)
    private String content;

    @Column
    private String writeday;

    @Column
    private String chrct;

    @Column
    private String director;

    @Column
    private String grade;

    @Column
    private String genre;

    @Column
    private String nation;

    @Column
    private String rtime;

    public Media() {}

    public Media(String subject, String content, String writeday, String chrct, String director, String grade,
                 String genre, String nation, String rtime) {
        super();
        this.subject = subject;
        this.content = content;
        this.writeday = writeday;
        this.chrct = chrct;
        this.director = director;
        this.grade = grade;
        this.genre = genre;
        this.nation = nation;
        this.rtime = rtime;
    }



    public Long getMediaNum() {
        return mediaNum;
    }

    public void setMediaNum(Long mediaNum) {
        this.mediaNum = mediaNum;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriteday() {
        return writeday;
    }

    public void setWriteday(String writeday) {
        this.writeday = writeday;
    }

    public String getChrct() {
        return chrct;
    }

    public void setChrct(String chrct) {
        this.chrct = chrct;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }
}
