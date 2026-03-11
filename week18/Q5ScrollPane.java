package week18;
import javax.swing.*;

public class Q5ScrollPane 
{

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("ScrollPane Example");

        String[] columns = {"ID","Name"};
        Object[][] data = new Object[20][2];

        for(int i=0;i<20;i++)
        {
            data[i][0] = i+1;
            data[i][1] = "Student "+(i+1);
        }

        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}