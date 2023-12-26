package aplikasibuku.Main;
 
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import javax.swing.JFrame;
import javax.swing.tree.TreeNode;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author H A B I B
 */
public class AplikasiBukuKu extends javax.swing.JFrame {
    
    public AplikasiBukuKu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Data();
        jTree.setCellRenderer(new IconNodeTree());
        updateComboBox(kategoriComboBox, menu, "Kategori");
        updateComboBox(pengarangComboBox, menu, "Pengarang");
        updateComboBox(tahunTerbitComboBox, menu, "Tahun Terbit");

    }
    
    DefaultTreeModel model;
    DefaultMutableTreeNode menu = new DefaultMutableTreeNode("BukuKu");
    
    public void Data() {
    DefaultMutableTreeNode kategori = new DefaultMutableTreeNode("Kategori");

    DefaultMutableTreeNode fiksi = new DefaultMutableTreeNode("Fiksi");
    fiksi.add(new DefaultMutableTreeNode("Assalamualaikum, Beijing!"));
    fiksi.add(new DefaultMutableTreeNode("Atomic Habits"));
    fiksi.add(new DefaultMutableTreeNode("Ayah"));
    fiksi.add(new DefaultMutableTreeNode("Ayahku bukan pembohong"));
    fiksi.add(new DefaultMutableTreeNode("Ayat Ayat Cinta"));
    fiksi.add(new DefaultMutableTreeNode("Berani Tidak Disukai"));
    fiksi.add(new DefaultMutableTreeNode("Cantik itu Luka"));
    fiksi.add(new DefaultMutableTreeNode("Catherine House"));
    fiksi.add(new DefaultMutableTreeNode("Cinta di Ujung Sejadah"));
    fiksi.add(new DefaultMutableTreeNode("Di Bawah Lindungan Ka'bah"));
    fiksi.add(new DefaultMutableTreeNode("Edensor"));
    fiksi.add(new DefaultMutableTreeNode("Girls in The Dark"));
    fiksi.add(new DefaultMutableTreeNode("Hujan"));
    fiksi.add(new DefaultMutableTreeNode("Hyouka"));
    fiksi.add(new DefaultMutableTreeNode("I Went to See My Father"));
    fiksi.add(new DefaultMutableTreeNode("Jade City"));
    fiksi.add(new DefaultMutableTreeNode("Kau, Aku dan Sepucuk Angpau Merah"));
    fiksi.add(new DefaultMutableTreeNode("Laskar Pelangi"));
    fiksi.add(new DefaultMutableTreeNode("Lelaki Harimau"));
    fiksi.add(new DefaultMutableTreeNode("Maryamah Karpov"));
    fiksi.add(new DefaultMutableTreeNode("Memory of Glass"));
    fiksi.add(new DefaultMutableTreeNode("Merantau ke Deli"));
    fiksi.add(new DefaultMutableTreeNode("Negeri 5 Menara"));
    fiksi.add(new DefaultMutableTreeNode("Rembulan Tenggelam di Wajahmu"));
    fiksi.add(new DefaultMutableTreeNode("Rumah Tanpa Jendela"));
    fiksi.add(new DefaultMutableTreeNode("Sang pemimpi"));
    fiksi.add(new DefaultMutableTreeNode("Sebelas patriot"));
    fiksi.add(new DefaultMutableTreeNode("Seperti Dendam, Rindu Harus Dibayar Tuntas"));
    fiksi.add(new DefaultMutableTreeNode("Si Putih"));
    fiksi.add(new DefaultMutableTreeNode("Tenggelamnya Kapal Van Der Wijck"));
    fiksi.add(new DefaultMutableTreeNode("Tentang Kamu"));
    fiksi.add(new DefaultMutableTreeNode("These Violent Delights"));
    fiksi.add(new DefaultMutableTreeNode("Trick Mirror"));
    fiksi.add(new DefaultMutableTreeNode("Anak Rantau"));

    DefaultMutableTreeNode nonFiksi = new DefaultMutableTreeNode("Non Fiksi");
    nonFiksi.add(new DefaultMutableTreeNode("Tafsir Al-Azhar"));
    nonFiksi.add(new DefaultMutableTreeNode("Kamus Inggris Indonesia"));
    nonFiksi.add(new DefaultMutableTreeNode("Kamus Indonesia Inggris"));
    nonFiksi.add(new DefaultMutableTreeNode("Ensiklopedia Anak"));

    kategori.add(fiksi);
    kategori.add(nonFiksi);

    DefaultMutableTreeNode pengarang = new DefaultMutableTreeNode("Pengarang");

    DefaultMutableTreeNode andreaHirata = new DefaultMutableTreeNode("Andrea Hirata");
    andreaHirata.add(new DefaultMutableTreeNode("Ayah"));
    andreaHirata.add(new DefaultMutableTreeNode("Edensor"));
    andreaHirata.add(new DefaultMutableTreeNode("Laskar Pelangi"));
    andreaHirata.add(new DefaultMutableTreeNode("Maryamah Karpov"));
    andreaHirata.add(new DefaultMutableTreeNode("Sang pemimpi"));
    andreaHirata.add(new DefaultMutableTreeNode("Sebelas patriot"));

    DefaultMutableTreeNode asmaNadia = new DefaultMutableTreeNode("Asma Nadia");
    asmaNadia.add(new DefaultMutableTreeNode("Assalamualaikum, Beijing!"));
    asmaNadia.add(new DefaultMutableTreeNode("Cinta di Ujung Sejadah"));
    asmaNadia.add(new DefaultMutableTreeNode("Rumah Tanpa Jendela"));

    DefaultMutableTreeNode boyCandra = new DefaultMutableTreeNode("Boy Candra");
    DefaultMutableTreeNode buyaHamka = new DefaultMutableTreeNode("Buya Hamka");
    buyaHamka.add(new DefaultMutableTreeNode("Di Bawah Lindungan Ka'bah"));
    buyaHamka.add(new DefaultMutableTreeNode("Merantau ke Deli"));
    buyaHamka.add(new DefaultMutableTreeNode("Tafsir Al-Azhar"));
    buyaHamka.add(new DefaultMutableTreeNode("Tenggelamnya Kapal Van Der Wijck"));

    DefaultMutableTreeNode dewiLestari= new DefaultMutableTreeNode("Dewi Lestari");
    DefaultMutableTreeNode eiichiroOda = new DefaultMutableTreeNode("Eiichiro Oda");
    DefaultMutableTreeNode ekaKurniawan = new DefaultMutableTreeNode("Eka Kurniawan");
    ekaKurniawan.add(new DefaultMutableTreeNode("Cantik itu Luka"));
    ekaKurniawan.add(new DefaultMutableTreeNode("Lelaki Harimau"));
    ekaKurniawan.add(new DefaultMutableTreeNode("Seperti Dendam, Rindu Harus Dibayar Tuntas"));
    
    DefaultMutableTreeNode habiburrahmanElShirazy = new DefaultMutableTreeNode("Habiburrahman El Shirazy");
    DefaultMutableTreeNode hwangSunMi = new DefaultMutableTreeNode("Hwang Sun Mi");
    DefaultMutableTreeNode junjiIto = new DefaultMutableTreeNode("Junji Ito");
    DefaultMutableTreeNode keigoHigashino = new DefaultMutableTreeNode("Keigo Higashino");
    DefaultMutableTreeNode kyungSookShin = new DefaultMutableTreeNode("Kyung-Sook Shin");
    DefaultMutableTreeNode mochtarLubis = new DefaultMutableTreeNode("Mochtar Lubis");
    DefaultMutableTreeNode tereLiye = new DefaultMutableTreeNode("Tere Liye");
    tereLiye.add(new DefaultMutableTreeNode("Ayahku bukan pembohong"));
    tereLiye.add(new DefaultMutableTreeNode("Hujan"));
    tereLiye.add(new DefaultMutableTreeNode("Kau, Aku dan Sepucuk Angpau Merah"));
    tereLiye.add(new DefaultMutableTreeNode("Rembulan Tenggelam di Wajahmu"));
    tereLiye.add(new DefaultMutableTreeNode("Si Putih"));
    tereLiye.add(new DefaultMutableTreeNode("Tentang Kamu"));    

    pengarang.add(andreaHirata);
    pengarang.add(asmaNadia);
    pengarang.add(boyCandra);
    pengarang.add(buyaHamka);
    pengarang.add(dewiLestari);
    pengarang.add(eiichiroOda);
    pengarang.add(ekaKurniawan);   
    pengarang.add(habiburrahmanElShirazy);
    pengarang.add(hwangSunMi);
    pengarang.add(junjiIto);
    pengarang.add(keigoHigashino);    
    pengarang.add(kyungSookShin);  
    pengarang.add(mochtarLubis);
    pengarang.add(tereLiye);  

    DefaultMutableTreeNode tahunTerbit = new DefaultMutableTreeNode("Tahun Terbit");

    DefaultMutableTreeNode tahun2023 = new DefaultMutableTreeNode("2023");
    tahun2023.add(new DefaultMutableTreeNode("I Went to See My Father"));
    
    DefaultMutableTreeNode tahun2022 = new DefaultMutableTreeNode("2022");
    tahun2022.add(new DefaultMutableTreeNode("Si Putih"));
    
    DefaultMutableTreeNode tahun2021 = new DefaultMutableTreeNode("2021");
    DefaultMutableTreeNode tahun2020 = new DefaultMutableTreeNode("2020");
    DefaultMutableTreeNode tahun2019 = new DefaultMutableTreeNode("2019");
    DefaultMutableTreeNode tahun2018 = new DefaultMutableTreeNode("2018");
    DefaultMutableTreeNode tahun2017 = new DefaultMutableTreeNode("2017");
    DefaultMutableTreeNode tahun2016 = new DefaultMutableTreeNode("2016"); 
    DefaultMutableTreeNode tahun2015 = new DefaultMutableTreeNode("2015");
    tahun2015.add(new DefaultMutableTreeNode("Ayah"));

    DefaultMutableTreeNode tahun2014 = new DefaultMutableTreeNode("2014");
    tahun2014.add(new DefaultMutableTreeNode("Seperti Dendam, Rindu Harus Dibayar Tuntas"));

    DefaultMutableTreeNode tahun2013 = new DefaultMutableTreeNode("2013");
    tahun2013.add(new DefaultMutableTreeNode("Assalamualaikum, Beijing!"));

    DefaultMutableTreeNode tahun2012 = new DefaultMutableTreeNode("2012");
    DefaultMutableTreeNode tahun2011 = new DefaultMutableTreeNode("2011");
    tahun2011.add(new DefaultMutableTreeNode("Sebelas patriot"));
    tahun2011.add(new DefaultMutableTreeNode("Rumah Tanpa Jendela"));

    DefaultMutableTreeNode tahun2010 = new DefaultMutableTreeNode("2010");
    DefaultMutableTreeNode tahun2009 = new DefaultMutableTreeNode("2009");
    DefaultMutableTreeNode tahun2008 = new DefaultMutableTreeNode("2008");
    tahun2008.add(new DefaultMutableTreeNode("Cinta di Ujung Sejadah"));
            
    DefaultMutableTreeNode tahun2007 = new DefaultMutableTreeNode("2007");
    tahun2007.add(new DefaultMutableTreeNode("Edensor"));

    DefaultMutableTreeNode tahun2006 = new DefaultMutableTreeNode("2006");
    tahun2006.add(new DefaultMutableTreeNode("Sang pemimpi"));

    DefaultMutableTreeNode tahun2005=  new DefaultMutableTreeNode("2005");
    tahun2005.add(new DefaultMutableTreeNode("Laskar Pelangi"));

    DefaultMutableTreeNode tahun2004 = new DefaultMutableTreeNode("2004");
    tahun2004.add(new DefaultMutableTreeNode("Lelaki Harimau"));

    DefaultMutableTreeNode tahun2003 = new DefaultMutableTreeNode("2003");
    DefaultMutableTreeNode tahun2002 = new DefaultMutableTreeNode("2002");
    tahun2002.add(new DefaultMutableTreeNode("Cantik itu Luka"));


    tahunTerbit.add(tahun2023);
    tahunTerbit.add(tahun2022);
    tahunTerbit.add(tahun2021);
    tahunTerbit.add(tahun2020);
    tahunTerbit.add(tahun2019);
    tahunTerbit.add(tahun2018);
    tahunTerbit.add(tahun2017);
    tahunTerbit.add(tahun2016);
    tahunTerbit.add(tahun2015);
    tahunTerbit.add(tahun2014);
    tahunTerbit.add(tahun2013);
    tahunTerbit.add(tahun2012);
    tahunTerbit.add(tahun2011);
    tahunTerbit.add(tahun2010);
    tahunTerbit.add(tahun2009);
    tahunTerbit.add(tahun2008);
    tahunTerbit.add(tahun2007);
    tahunTerbit.add(tahun2006);
    tahunTerbit.add(tahun2005);
    tahunTerbit.add(tahun2004);
    tahunTerbit.add(tahun2003);
    tahunTerbit.add(tahun2002);

    menu.add(kategori);
    menu.add(pengarang);
    menu.add(tahunTerbit);

    model = (DefaultTreeModel) jTree.getModel();
    model.setRoot(menu);
    jTree.setModel(model);
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDasar = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        jpKiri = new javax.swing.JPanel();
        iconBukuKu = new javax.swing.JLabel();
        labelBukuKu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        btnHapus = new javax.swing.JButton();
        labelJudulBuku1 = new javax.swing.JLabel();
        txtMasukkan = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnTambahNode = new javax.swing.JButton();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jpTabel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jpTambahBuku = new javax.swing.JPanel();
        labelJudulBuku = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        labelPengarang = new javax.swing.JLabel();
        labelTahunTerbit = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        labelTambahBuku = new javax.swing.JLabel();
        kategoriComboBox = new javax.swing.JComboBox<>();
        pengarangComboBox = new javax.swing.JComboBox<>();
        tahunTerbitComboBox = new javax.swing.JComboBox<>();
        btnTambahBuku = new javax.swing.JButton();
        btnAboutUs = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDasar.setBackground(new java.awt.Color(185, 154, 129));

        jpHeader.setBackground(new java.awt.Color(185, 154, 129));

        labelHeader.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("Sistem Manajemen Buku");

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        jpKiri.setBackground(new java.awt.Color(185, 154, 129));

        iconBukuKu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibuku/Image/icons8-books-48.png"))); // NOI18N

        labelBukuKu.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        labelBukuKu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBukuKu.setText("BukuKu");
        labelBukuKu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBukuKuMouseClicked(evt);
            }
        });

        jTree.setBackground(new java.awt.Color(247, 229, 217));
        jTree.setBorder(null);
        jTree.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree.setToolTipText("");
        jTree.setAutoscrolls(true);
        jTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);
        jTree.getAccessibleContext().setAccessibleName("");

        btnHapus.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        labelJudulBuku1.setBackground(new java.awt.Color(255, 255, 255));
        labelJudulBuku1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        labelJudulBuku1.setText("Masukkan : ");

        txtMasukkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasukkanActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnTambahNode.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btnTambahNode.setText("Tambah");
        btnTambahNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahNodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpKiriLayout = new javax.swing.GroupLayout(jpKiri);
        jpKiri.setLayout(jpKiriLayout);
        jpKiriLayout.setHorizontalGroup(
            jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKiriLayout.createSequentialGroup()
                .addGroup(jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpKiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelJudulBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpKiriLayout.createSequentialGroup()
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTambahNode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus))
                            .addGroup(jpKiriLayout.createSequentialGroup()
                                .addComponent(txtMasukkan)
                                .addGap(1, 1, 1))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(jpKiriLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconBukuKu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelBukuKu)
                .addGap(25, 25, 25))
        );
        jpKiriLayout.setVerticalGroup(
            jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBukuKu)
                    .addComponent(labelBukuKu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJudulBuku1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMasukkan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(btnTambahNode)
                    .addComponent(btnHapus))
                .addGap(17, 17, 17))
        );

        jTabbedPaneMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPaneMenu.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jTabbedPaneMenu.setName(""); // NOI18N
        jTabbedPaneMenu.setRequestFocusEnabled(false);

        jpTabel.setBackground(new java.awt.Color(255, 255, 255));

        jTable.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                " "
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        javax.swing.GroupLayout jpTabelLayout = new javax.swing.GroupLayout(jpTabel);
        jpTabel.setLayout(jpTabelLayout);
        jpTabelLayout.setHorizontalGroup(
            jpTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        jpTabelLayout.setVerticalGroup(
            jpTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        jTabbedPaneMenu.addTab("Tabel Node", jpTabel);

        jpTambahBuku.setBackground(new java.awt.Color(255, 255, 255));
        jpTambahBuku.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelJudulBuku.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        labelJudulBuku.setText("Judul Buku    :");

        labelKategori.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        labelKategori.setText("Kategori         :");

        labelPengarang.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        labelPengarang.setText("Pengarang      :");

        labelTahunTerbit.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        labelTahunTerbit.setText("Tahun Terbit :");

        txtJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulBukuActionPerformed(evt);
            }
        });

        labelTambahBuku.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        labelTambahBuku.setText("Tambahkan Buku");

        kategoriComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriComboBoxActionPerformed(evt);
            }
        });

        pengarangComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengarangComboBoxActionPerformed(evt);
            }
        });

        btnTambahBuku.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnTambahBuku.setText("Tambahkan");
        btnTambahBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTambahBukuLayout = new javax.swing.GroupLayout(jpTambahBuku);
        jpTambahBuku.setLayout(jpTambahBukuLayout);
        jpTambahBukuLayout.setHorizontalGroup(
            jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTambahBukuLayout.createSequentialGroup()
                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTambahBukuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTambahBuku)
                            .addGroup(jpTambahBukuLayout.createSequentialGroup()
                                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelJudulBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(labelKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kategoriComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTambahBukuLayout.createSequentialGroup()
                                .addComponent(labelTahunTerbit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tahunTerbitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTambahBukuLayout.createSequentialGroup()
                                .addComponent(labelPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(pengarangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpTambahBukuLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnTambahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jpTambahBukuLayout.setVerticalGroup(
            jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTambahBukuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTambahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJudulBuku)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKategori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pengarangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPengarang))
                .addGap(21, 21, 21)
                .addGroup(jpTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunTerbitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTahunTerbit))
                .addGap(18, 18, 18)
                .addComponent(btnTambahBuku)
                .addGap(135, 135, 135))
        );

        jTabbedPaneMenu.addTab("Tambah Buku", jpTambahBuku);

        btnAboutUs.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btnAboutUs.setText("About Us");
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDasarLayout = new javax.swing.GroupLayout(panelDasar);
        panelDasar.setLayout(panelDasarLayout);
        panelDasarLayout.setHorizontalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDasarLayout.createSequentialGroup()
                .addComponent(jpKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDasarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPaneMenu))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDasarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        panelDasarLayout.setVerticalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDasarLayout.createSequentialGroup()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAboutUs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeluar)
                .addContainerGap())
            .addComponent(jpKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDasar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDasar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private JFrame exit;
    
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        exit = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(exit, "Apakah anda ingin keluar", "BukuKu", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void jTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMouseClicked
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        
        if (selectedNode != null && selectedNode.getParent() != null) {
            tampilkanNode(selectedNode);
        }
    }//GEN-LAST:event_jTreeMouseClicked

    public void tampilkanNode(DefaultMutableTreeNode selectedNode) {
        DefaultTableModel tableModel = new DefaultTableModel();

        if (selectedNode.getChildCount() > 0) {
            tableModel.addColumn(selectedNode.getUserObject().toString());
            for (int i = 0; i < selectedNode.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) selectedNode.getChildAt(i);
            tableModel.addRow(new Object[]{child.getUserObject()});
            }
        } else {
            tableModel.addColumn(" ");
        }
        
        jTable.setModel(tableModel);
    }
    
    private void labelBukuKuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBukuKuMouseClicked

    }//GEN-LAST:event_labelBukuKuMouseClicked

    private JFrame frame;
    
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        TreePath selectedPath = jTree.getSelectionPath();
        
        if (selectedPath == null) {
            JOptionPane.showMessageDialog(frame, "Pilih node terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        String nodeName = selectedNode.getUserObject().toString();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();

        hapusNode(root, nodeName, model);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void hapusNode(DefaultMutableTreeNode node, String nodeName, DefaultTreeModel model) {
        Enumeration<?> children = node.children();
        
        while (children.hasMoreElements()) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) children.nextElement();
            if (nodeName.equals(child.getUserObject().toString())) {
            model.removeNodeFromParent(child);
            } else {
                hapusNode(child, nodeName, model);
            }
        }
    }
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String targetTitle = txtMasukkan.getText();
        
        if(!targetTitle.isEmpty()){
            hasilPencarian(targetTitle);
            txtMasukkan.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Masukkan yang akan dicari terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private List<DefaultMutableTreeNode> pencarianNode(DefaultMutableTreeNode currentNode, String targetTitle) {
        List<DefaultMutableTreeNode> resultNodes = new ArrayList<>();
        
        if (currentNode.getUserObject().toString().equalsIgnoreCase(targetTitle)) {
            resultNodes.add(currentNode);
        }
        int childCount = currentNode.getChildCount();
        
        for (int i = 0; i < childCount; i++) {
            DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) currentNode.getChildAt(i);
            resultNodes.addAll(pencarianNode(childNode, targetTitle));
        }
        return resultNodes;
    }

    private void printPencarian(List<DefaultMutableTreeNode> nodes) {
        StringBuilder allPathsString = new StringBuilder("Alur tree untuk buku \"" + nodes.get(0).getUserObject() + "\":\n");
        
        for (DefaultMutableTreeNode node : nodes) {
            TreeNode[] path = model.getPathToRoot(node);
            StringBuilder pathString = new StringBuilder();
            for (int i = 0; i < path.length; i++) {
                pathString.append(path[i].toString());
                if (i < path.length - 1) {
                    pathString.append(" -> ");
                }
            }
            allPathsString.append(pathString.toString()).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, allPathsString.toString());
    }

    public void hasilPencarian(String targetTitle) {
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) model.getRoot();
        List<DefaultMutableTreeNode> resultNodes = pencarianNode(rootNode, targetTitle);
        
        if (!resultNodes.isEmpty()) {
            printPencarian(resultNodes);
        } else {
            JOptionPane.showMessageDialog(null, "Buku dengan judul \"" + targetTitle + "\" tidak ditemukan.");
        }
    }

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
    }//GEN-LAST:event_jTableMouseClicked

    private void updateComboBox(JComboBox<String> comboBox, DefaultMutableTreeNode parentNode, String nodeName) {
        comboBox.removeAllItems();
        DefaultMutableTreeNode node = getNodeByName(parentNode, nodeName);
        
        if (node != null) {
            comboBox.addItem(node.toString());
            Enumeration<TreeNode> enumeration = node.children();
            while (enumeration.hasMoreElements()) {
                DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) enumeration.nextElement();
                comboBox.addItem(childNode.toString());
            }
        }
    }

    private DefaultMutableTreeNode getNodeByName(DefaultMutableTreeNode parentNode, String nodeName) {
        Enumeration<TreeNode> enumeration = parentNode.children();
        
        while (enumeration.hasMoreElements()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) enumeration.nextElement();
            if (nodeName.equals(node.toString())) {
                return node;
            }
        }
        return null;
    }
    
    private void btnTambahNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahNodeActionPerformed
        String addNode = txtMasukkan.getText().trim();
    
        if (!addNode.isEmpty()) {
            TreeSelectionModel selectModel = jTree.getSelectionModel();        
            if (selectModel.getSelectionCount() > 0) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getSelectionPath().getLastPathComponent();
                addNodeAndUpdateComboBox(selectedNode, addNode);
                txtMasukkan.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Pilih node terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Masukkan terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnTambahNodeActionPerformed
    
    private void addNodeAndUpdateComboBox(DefaultMutableTreeNode parentNode, String nodeName) {
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(nodeName);
        parentNode.add(newNode);
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        model.reload();
        
        if (parentNode.toString().equals("Kategori")) {
            updateComboBox(kategoriComboBox, menu, "Kategori");
        } else if (parentNode.toString().equals("Pengarang")) {
            updateComboBox(pengarangComboBox, menu, "Pengarang");
        } else if (parentNode.toString().equals("Tahun Terbit")) {
            updateComboBox(tahunTerbitComboBox, menu, "Tahun Terbit");
        }
    }
    
    private void txtMasukkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasukkanActionPerformed

    }//GEN-LAST:event_txtMasukkanActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        new AboutUs().setVisible(true);
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void btnTambahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBukuActionPerformed
        String addValue = txtJudulBuku.getText().trim();
        String kategori = (String) kategoriComboBox.getSelectedItem();
        String pengarang = (String) pengarangComboBox.getSelectedItem();
        String tahunRilis = (String) tahunTerbitComboBox.getSelectedItem();
        
        if (addValue.isEmpty() || kategoriComboBox.getSelectedIndex()== 0 || pengarangComboBox.getSelectedIndex()== 0 || tahunTerbitComboBox.getSelectedIndex()== 0) {
            JOptionPane.showMessageDialog(frame, "Selesaikan pengisian terlebih dahulu", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            addToNode(kategori, addValue);
            addToNode(pengarang, addValue);
            addToNode(tahunRilis, addValue);
            txtJudulBuku.setText("");
            kategoriComboBox.setSelectedIndex(0);
            pengarangComboBox.setSelectedIndex(0);
            tahunTerbitComboBox.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnTambahBukuActionPerformed

    private void addToNode(String parentNodeValue, String newValue) {
        DefaultMutableTreeNode parentNode = findNode(parentNodeValue);
        
        if (parentNode != null) {
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newValue);
            parentNode.add(newNode);
            DefaultTreeModel treeModel = (DefaultTreeModel) jTree.getModel();
            treeModel.reload();
        }
    }
    
    private DefaultMutableTreeNode findNode(String nodeValue) {
        Enumeration<TreeNode> enumeration = ((DefaultMutableTreeNode) model.getRoot()).breadthFirstEnumeration();

        while (enumeration.hasMoreElements()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) enumeration.nextElement();
        if (nodeValue.equals(node.getUserObject().toString())) {
            return node;
            }
        }
        return null;
    }
    
    private void kategoriComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriComboBoxActionPerformed

    }//GEN-LAST:event_kategoriComboBoxActionPerformed

    private void txtJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulBukuActionPerformed

    }//GEN-LAST:event_txtJudulBukuActionPerformed

    private void pengarangComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengarangComboBoxActionPerformed

    }//GEN-LAST:event_pengarangComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiBukuKu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambahBuku;
    private javax.swing.JButton btnTambahNode;
    private javax.swing.JLabel iconBukuKu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneMenu;
    private javax.swing.JTable jTable;
    private javax.swing.JTree jTree;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpKiri;
    private javax.swing.JPanel jpTabel;
    private javax.swing.JPanel jpTambahBuku;
    private javax.swing.JComboBox<String> kategoriComboBox;
    private javax.swing.JLabel labelBukuKu;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelJudulBuku;
    private javax.swing.JLabel labelJudulBuku1;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelPengarang;
    private javax.swing.JLabel labelTahunTerbit;
    private javax.swing.JLabel labelTambahBuku;
    private javax.swing.JPanel panelDasar;
    private javax.swing.JComboBox<String> pengarangComboBox;
    private javax.swing.JComboBox<String> tahunTerbitComboBox;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtMasukkan;
    // End of variables declaration//GEN-END:variables
}