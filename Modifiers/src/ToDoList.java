import javax.swing.*;

public class ToDoList extends JFrame {
    public ToDoList(){
        super("To Do List App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(Constraints.Gui_Size);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

    }
}
