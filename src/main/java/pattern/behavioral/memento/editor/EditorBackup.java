package pattern.behavioral.memento.editor;

public class EditorBackup {

    private EditorSnapshot backup;

    public void backup(Editor editor){
        System.out.println("back up: "+ editor.getContent());
        backup = editor.createSnapshot();
    }

    public Editor restore(){
        Editor editor = backup.restore();
        System.out.println("restore: "+ editor.getContent());
        return editor;
    }

}
