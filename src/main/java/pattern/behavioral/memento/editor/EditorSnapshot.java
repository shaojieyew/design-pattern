package pattern.behavioral.memento.editor;

public class EditorSnapshot {

    private String title;
    private String content;

     EditorSnapshot(String title, String content) {
        this.title = title;
        this.content = content;
    }

     Editor restore(){
        return  new Editor(title, content);
    }
}
