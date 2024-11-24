package com.spendwiseduo.pft;

import atlantafx.base.theme.PrimerLight;
import com.spendwiseduo.pft.util.UserDatabaseUtil;
import com.spendwiseduo.pft.view.MainLayout;
import java.sql.Connection;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** JavaFX App. */
public class MainApp extends Application {
    /** Start the app. */
    @Override
    public void start(final Stage stage) {
        String userId = "testId";
        String password = "testPw";
        try {
            Connection connection = UserDatabaseUtil.connect(userId, password);
        } catch (SQLException e) {
            // handle it.
        }

        Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());

        final int w = 1280;
        final int h = 720;

        MainLayout mainLayout = new MainLayout();

        Scene scene = new Scene(mainLayout, w, h);

        stage.setTitle("Personal Finance Tracker");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        launch();
    }
}
