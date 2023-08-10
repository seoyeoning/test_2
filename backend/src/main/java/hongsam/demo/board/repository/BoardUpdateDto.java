package hongsam.demo.board.repository;

import lombok.Data;

@Data
public class BoardUpdateDto {

    private String title;
    private String content;

    public BoardUpdateDto() {
    }

    public BoardUpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
