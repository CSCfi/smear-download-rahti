package fi.csc.avaa.smear.download;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * the main view.
 */
@Route
@PWA(name = "SMEAR download", shortName = "SMEAR download")
public class MainView extends VerticalLayout {
    private HorizontalLayout layout;
    private VerticalLayout tablesection;
    private ResizingTable muuttujat;
    private DatePicker enddate = new DatePicker("To:");
    private DatePicker startdate = new DatePicker("From:");
    private Button prevbutton = new Button("<<");
    private Button nextbutton = new Button(">>");
    private ComboBox quality = new ComboBox("Quality Level:");
    private ComboBox averaging = new ComboBox("Averaging:");
    private ComboBox averagingType = new ComboBox("Averaging Type:");
    private RadioButtonGroup asemat = new RadioButtonGroup<>();
    private Select timewindow = new Select("Day", "Week", "Month");
    private Select kategoria = new Select("Select variable category");
    private Button dlBtn;
    private Checkbox calcAvailability;
    private TextField tf;
    private Checkbox filterTitleCheckbox;
    private Checkbox filterDescriptionCheckbox;
    private Checkbox filterSourceCheckbox;

    public MainView() {
        layout = new HorizontalLayout();


        VerticalLayout left = new VerticalLayout();
        VerticalLayout right = new VerticalLayout();
        tablesection = new VerticalLayout();
        tablesection.setSizeFull();
        tablesection.setSpacing(true);
        right.add (tablesection);
	    VerticalLayout queryFirstRowLayout = new VerticalLayout();
	    buildTable();
        Button dlSelectedBtn = new Button("Download selected");

        HorizontalLayout hsplit = new HorizontalLayout();
        hsplit.setWidth("250px");
        hsplit.add(startdate);
        hsplit.add(enddate);
        queryFirstRowLayout.add(hsplit);
        HorizontalLayout timesplit = new HorizontalLayout();
        //timesplit.setCaption("Shift:");
        timesplit.add(prevbutton);
        timesplit.add(timewindow);
        timesplit.add(nextbutton);
        queryFirstRowLayout.add(timesplit);
        averaging.setItems("NONE", "30MIN", "1HOUR");

        VerticalLayout querySecondRowLayout = new VerticalLayout();
        querySecondRowLayout.add(quality);
        querySecondRowLayout.add(averaging);
        querySecondRowLayout.add(averagingType);
        left.add(querySecondRowLayout);

        VerticalLayout queryThirdRowLayout = new VerticalLayout();
        calcAvailability = new Checkbox("Calculate availability on update", false);
        //calcAvailability.setDescription("Check this if you want availability calculated for all variables in the table after clicking update. Please note for long time spans this operation may be very slow.");
        Dialog helpPopup = new Dialog();
        helpPopup.add(new Label(Constants.HELPCONTENT));
        helpPopup.setWidth("500px");
        queryThirdRowLayout.add(helpPopup);
        queryThirdRowLayout.add(asemat);
        queryThirdRowLayout.add(kategoria);
        queryThirdRowLayout.add(calcAvailability);
        left.add(queryThirdRowLayout);


        VerticalLayout queryFourthRowLayout = new VerticalLayout();
         tf = new TextField("Filter");
        tf.setVisible(true);
        filterTitleCheckbox = new Checkbox("Variable");
        filterDescriptionCheckbox = new Checkbox("Description");
        filterSourceCheckbox = new Checkbox("Source");
        HorizontalLayout filterBoxRowLayout = new HorizontalLayout();
        filterBoxRowLayout.add(filterTitleCheckbox);
        filterBoxRowLayout.add(filterDescriptionCheckbox);
        filterBoxRowLayout.add(filterSourceCheckbox);
        HorizontalLayout filterTextRowLayout = new HorizontalLayout();
        filterTextRowLayout.add(tf);
        left.add(filterTextRowLayout);
        left.add(filterBoxRowLayout);
        left.add(queryFourthRowLayout);

        layout.add(left);
        layout.add(right);
        add(layout);
    }

      private void buildTable() {
        muuttujat = new ResizingTable(Variable.class);
       // muuttujat.setImmediate(true);
        muuttujat.setWidth("1052px");
        muuttujat.setVisible(false);
        //muuttujat.setStyleName("variable-table");
        //muuttujat.setColumns("Variable", "Description", "Source", "Availability %", "Download", "Select");
        /*
        muuttujat.addHeaderClickListener((HeaderClickListener) (HeaderClickEvent event) -> {
            // Check if Select column is clicked
            if (CHECKBOX_COLUMN_ID.equals(event.getPropertyId())) {
                if (get_select_all_value()) {
                    set_select_all(false);
                    muuttujat.setColumnHeader("Select", "Select All");
                    for (Object itemId : muuttujat.getItemIds()) {
                        CheckBox checkbox = (CheckBox) muuttujat.getItem(itemId).getItemProperty("Select").getValue();
                        checkbox.setValue(false);
                        muuttujat.getItem(itemId).getItemProperty("Select").setValue(checkbox);
                    }
                } else {
                    set_select_all(true);
                    muuttujat.setColumnHeader("Select", "Unselect All");
                    for (Object itemId : muuttujat.getItemIds()) {
                        CheckBox checkbox = (CheckBox) muuttujat.getItem(itemId).getItemProperty("Select").getValue();
                        checkbox.setValue(true);
                        muuttujat.getItem(itemId).getItemProperty("Select").setValue(checkbox);
                    }
                }
            }
        });
        */

        //muuttujat.setMinWidth();
//muuttujat.addColumn(Variable::getVariable).setHeader(("Variable").setKey("variable").setWidth("143px");

       // muuttujat.setColumnHeader("Select", "Select All");
        /*muuttujat.setCellStyleGenerator(new CellStyleGenerator() {

            @Override
            public String getStyle(Table source, Object itemId, Object propertyId) {
                if ("Variable".equals(propertyId)) {
                    return "variable";
                } else if ("Description".equals(propertyId)) {
                    return "description";
                } else if ("Source".equals(propertyId)) {
                    return "source";
                } else if ("Availability %".equals(propertyId)) {
                    return "availability";
                }
                return "";
            }
        });*/
    }


}
