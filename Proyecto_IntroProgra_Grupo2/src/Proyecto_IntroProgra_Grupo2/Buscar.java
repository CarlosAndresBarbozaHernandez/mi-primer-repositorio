/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto_IntroProgra_Grupo2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tloz
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();
    }

    public boolean cargarTable(String texto, Playlist pGeneral, Playlist[] playlists) {
        boolean isFound = false;
        DefaultTableModel model = new DefaultTableModel(new String[][]{}, new String[]{
            "Playlist", "Nombre", "Artista", "Album", "Ruta"});
        jTableResultados.setModel(model);

        if (pGeneral != null && pGeneral.getContadorCanciones() > 0) {
            for (int i = 0; i < pGeneral.getPlaylist().length; i++) {
                Cancion cancion = pGeneral.getPlaylist()[i];

                if (cancion != null && (cancion.getNombre().toLowerCase().contains(texto) || cancion.getArtista().toLowerCase().contains(texto)
                        || cancion.getAlbum().toLowerCase().contains(texto))) {
                    model.addRow(new String[]{playlists[i].getNombrePlaylist(), cancion.getNombre(), cancion.getArtista(), cancion.getAlbum(), cancion.getRutaCancion()});
                    isFound = true;
                }
            }
        }

        for (int i = 0; i < playlists.length; i++) {
            if (playlists[i] != null) {
                for (int j = 0; j < playlists[i].getPlaylist().length; j++) {
                    Cancion cancion = playlists[i].getPlaylist()[j];

                    if (cancion != null && (cancion.getNombre().toLowerCase().contains(texto) || cancion.getArtista().toLowerCase().contains(texto)
                            || cancion.getAlbum().toLowerCase().contains(texto))) {
                        model.addRow(new String[]{playlists[i].getNombrePlaylist(), cancion.getNombre(), cancion.getArtista(), cancion.getAlbum(), cancion.getRutaCancion()});
                        isFound = true;
                    }
                }
            }
        }
        
        return isFound;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Playlist", "Nombre", "Artista", "Album", "Ruta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
