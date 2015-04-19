package com.furryfaust.patterns;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class Assets {

    public ArrayList<Texture> tiles = new ArrayList<Texture>();
    public ArrayList<Texture> helpPages = new ArrayList<Texture>();
    public Texture actualCredits = new Texture("content/credits.png");
    public Texture random = new Texture("content/random.png");
    public Texture campaign = new Texture("content/campaign.png");

    public Texture board = new Texture("ui/playboard.png");
    public Texture easyHistory = new Texture("ui/easylog.png");
    public Texture hardHistory = new Texture("ui/hardlog.png");
    public Texture score = new Texture("ui/scoreboard.png");

    public Texture logo = new Texture("art/isolatedlogo.png");
    public Texture trophy = new Texture("art/trophy.png");

    public Texture continueButton = new Texture("buttons/continue.png");
    public Texture playButton = new Texture("buttons/play.png");
    public Texture creditsButton = new Texture("buttons/credits.png");
    public Texture logButton = new Texture("buttons/log.png");
    public Texture helpButton = new Texture("buttons/help.png");
    public Texture button = new Texture("buttons/button.png");
    public Texture easyButton = new Texture("buttons/easy.png");
    public Texture hardButton = new Texture("buttons/hard.png");

    public Assets() {
        tiles.add(null);
        for (int i = 1; i != 36; i++) {
            tiles.add(new Texture("content/tiles/" + i + ".png"));
        }
        helpPages.add(null);
        for (int i = 1; i != 6; i++) {
            helpPages.add(new Texture("content/help/" + i + ".png"));
        }
    }

}
