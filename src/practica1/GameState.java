/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author ruben
 */
public class GameState {

    private String labyrinth;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;

    public GameState(String labyrinth, String players, String monsters, int currentPlayer, String log) {
        this.labyrinth = labyrinth;
        this.players = players;
        this.monsters = monsters;
        this.currentPlayer = currentPlayer;
        this.log = log;
    }

    public String getLabyrinth() {
        return labyrinth;
    }

    public String getPlayers() {
        return players;
    }

    public String getMonsters() {
        return monsters;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isWinner() {
        return winner;
    }

    public String getLog() {
        return log;
    }

}
