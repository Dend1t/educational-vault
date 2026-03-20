import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTable table1;
    private JTable table2;

    private JButton addButton;
    private JButton removeButton;
    private JButton reverseButton;

    private DefaultTableModel model1;

    public Main() {
        setContentPane(contentPane);
        setModal(true);

        String[] columns1 = {"Элемент"};
        model1 = new DefaultTableModel(columns1, 0);
        table1.setModel(model1);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model1.addRow(new Object[]{model1.getRowCount() + 1});
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowCount = model1.getRowCount();

                if (rowCount > 0) {
                    model1.removeRow(rowCount - 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Таблица уже пуста!");
                }
            }
        });

        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table1.isEditing()) {
                    table1.getCellEditor().stopCellEditing();
                }

                SimpleLinkedList<String> list = new SimpleLinkedList<>();
                for (int i = 0; i < model1.getRowCount(); i++) {
                    Object value = model1.getValueAt(i, 0);
                    if (value != null) {
                        list.addLast(value.toString());
                    }
                }

                String[] columns2 = {"Reverse"};
                DefaultTableModel model2 = new DefaultTableModel(columns2, 0);
                table2.setModel(model2);
                list.reverse();
                for (String item : list) {
                    model2.addRow(new Object[]{item});
                }
            }
        });


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });
    }

    private void onOK() {
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        Main dialog = new Main();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}