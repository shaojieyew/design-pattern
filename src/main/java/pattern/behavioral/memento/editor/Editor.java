package pattern.behavioral.memento.editor;

public class Editor {

    private String title;
    private String content;

    public Editor() {

    }
    public Editor(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        System.out.println("content: "+ content);
    }

    public EditorSnapshot createSnapshot(){
        return new EditorSnapshot(title, content);
    }
}
