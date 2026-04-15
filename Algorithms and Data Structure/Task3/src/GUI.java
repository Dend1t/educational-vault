import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayDeque;
import java.util.Random;

public class GUI {
    private JPanel panel1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JTextArea textArea1;
    private JButton buttonAdd;
    private JButton buttonRemove;

    public GUI() {
        String[] columns = {"ID", "S", "T", "N"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        table1.setModel(model);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            model.addRow(new Object[]{
                    i + 1,random.nextInt(10),
                    random.nextInt(10),
                    random.nextInt(5) + 1
            });
        }

        button1.addActionListener(e -> {
            textArea1.setText(null);
            readTableData();
            textArea1.append("\n--- Результат (Standard Queue) ---\n");
            textArea1.append(TaskLogic.solve(new ArrayDeque<>()));
        });

        button2.addActionListener(e -> {
            textArea1.setText(null);
            readTableData();
            textArea1.append("\n--- Результат (Custom Queue) ---\n");
            textArea1.append(TaskLogic.solve(new SimpleDeque<>()));
        });

        buttonAdd.addActionListener(e -> {
            int newId = model.getRowCount() + 1;
            model.addRow(new Object[]{newId,
                    random.nextInt(10),
                    random.nextInt(10),
                    random.nextInt(5) + 1
            });
        });

        buttonRemove.addActionListener(e -> {
            int selectedRow = table1.getSelectedRow();
            if (selectedRow != -1) {
                model.removeRow(selectedRow);
            } else if (model.getRowCount() > 0) {
                model.removeRow(model.getRowCount() - 1);
            }
        });
    }

    private void readTableData() {
        TaskLogic.buyers.clear();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            try {
                if (model.getValueAt(i, 0) != null && !model.getValueAt(i, 0).toString().isEmpty()) {
                    int id = Integer.parseInt(model.getValueAt(i, 0).toString());
                    int s = Integer.parseInt(model.getValueAt(i, 1).toString());
                    int t = Integer.parseInt(model.getValueAt(i, 2).toString());
                    int n = Integer.parseInt(model.getValueAt(i, 3).toString());
                    TaskLogic.addBuyer(id, s, t, n);
                }
            } catch (Exception ex) {
            }
        }
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}