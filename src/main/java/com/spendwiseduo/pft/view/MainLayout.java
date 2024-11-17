package com.spendwiseduo.pft.view;

import com.spendwiseduo.pft.components.custombutton.CustomButton;
import com.spendwiseduo.pft.components.navbar.NavBar;
import com.spendwiseduo.pft.view.dashboard.Dashboard;
import com.spendwiseduo.pft.view.expense.Expense;
import com.spendwiseduo.pft.view.income.Income;
import com.spendwiseduo.pft.view.report.Report;
import java.util.List;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * The main layout of the application. It contains a navigation bar and a view area. The view area
 * displays different views based on the user's selection in the navigation bar.
 */
public class MainLayout extends HBox {
    public enum ViewName {
        DASHBOARD,
        INCOME,
        EXPENSE,
        REPORT
    }

    private List<Pane> views = List.of(new Dashboard(), new Income(), new Expense(), new Report());
    private NavBar navBar = createNavBar();

    /** Creates a new main layout. */
    public MainLayout() {
        this.getChildren().add(navBar);

        setActiveView(ViewName.DASHBOARD);
    }

    /**
     * Sets the active view based on the given view name.
     *
     * @param viewName the name of the view to set as active
     */
    public void setActiveView(final ViewName viewName) {
        int viewIndex = viewName.ordinal();

        navBar.setActiveButton(viewIndex);

        if (this.getChildren().size() > 1) {
            this.getChildren().remove(1);
        }

        this.getChildren().add(views.get(viewIndex));
    }

    /**
     * Creates a navigation bar with buttons for each view.
     *
     * @return the created navigation bar
     */
    private NavBar createNavBar() {
        CustomButton dashboardButton =
                new CustomButton("Dashboard", e -> setActiveView(ViewName.DASHBOARD));
        CustomButton incomeButton = new CustomButton("Income", e -> setActiveView(ViewName.INCOME));
        CustomButton expenseButton =
                new CustomButton("Expense", e -> setActiveView(ViewName.EXPENSE));
        CustomButton reportButton = new CustomButton("Report", e -> setActiveView(ViewName.REPORT));

        return new NavBar(List.of(dashboardButton, incomeButton, expenseButton, reportButton));
    }
}
