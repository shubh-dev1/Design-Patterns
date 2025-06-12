package BehavirolDesignPattern.MementoDesignPattern;



public class MementoPatternDemo {
  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    History history = new History();
    editor.setText("Version 1");
    history.saveState(editor);

    editor.setText("Version 2");
    history.saveState(editor);

    editor.setText("Version 3");
    System.out.println("Current Text: "+ editor.getText()); // Version 3

    history.undo(editor);
    System.out.println("After undo "+ editor.getText()); // Version 2

    history.undo(editor);
    System.out.println("After Undo "+ editor.getText()); // version 3

  }
}
