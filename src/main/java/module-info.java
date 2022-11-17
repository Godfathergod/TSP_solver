module com.company.tsp_solver {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens com.company.tsp_solver to javafx.fxml;
    exports com.company.tsp_solver;
    exports com.company.tsp_solver.methods;
    opens com.company.tsp_solver.methods to javafx.fxml;
}