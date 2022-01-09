package pattern.behavioral.memento;

import pattern.behavioral.memento.editor.Editor;
import pattern.behavioral.memento.editor.EditorBackup;

public class Demo {

    public static void main(String args[]){

        Editor editor = new Editor();
        editor.setTitle("title");
        editor.setContent("Hello");
        EditorBackup editorBackup = new EditorBackup();
        editorBackup.backup(editor);
        editor.setContent("Hello World");
        editor = editorBackup.restore();

    }

}
