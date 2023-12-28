package aplikasibuku.Main;

import java.awt.Component;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author H A B I B
 */
class IconNodeTree extends DefaultTreeCellRenderer {
    private Icon root = new ImageIcon(new ImageIcon(getClass().getResource("/aplikasibuku/Image/icons8-books-48.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    private Icon menu = new ImageIcon(new ImageIcon(getClass().getResource("/aplikasibuku/Image/icons8-books-64.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    private Icon submenu = new ImageIcon(new ImageIcon(getClass().getResource("/aplikasibuku/Image/icons8-books-64.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    private Icon buku = new ImageIcon(new ImageIcon(getClass().getResource("/aplikasibuku/Image/icons8-book-32.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        if (value instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
            if (node.getLevel() == 0) { // Node root (BukuKu)
                setIcon(root);
            } else if (node.getLevel() == 1) { // Node anak dari BukuKu (Kategori, Penerbit, Tahun Terbit)
                setIcon(submenu);
            } else if (node.getLevel() == 2) { // Node anak dari (Kategori, Penerbit, Tahun Terbit)
                setIcon(submenu);
            } else if (node.getLevel() == 3) { // Icon untuk buku 
                setIcon(buku);
            }
        }

        return this;
    }
}

