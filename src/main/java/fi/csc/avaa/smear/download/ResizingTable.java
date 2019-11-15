/**
 * 
 */
package fi.csc.avaa.smear.download;

import com.vaadin.flow.component.grid.Grid;
//import java.lang.Class;

/**
 * @author jmlehtin
 *
 */
public class ResizingTable extends Grid {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	/*public ResizingTable() {
		this.setResizable(true);
	}*/

	/**
	 * @param Class
	 */
	public ResizingTable(Class c) {
		super(c);
		//List<Column> lc = this.getColumns();
		//lc.forEach(column -> System.out.println(column.getKey()));
        this.getColumnByKey("variable").setWidth("143px").setResizable(true);
        this.getColumnByKey("description").setWidth("400px").setResizable(true);
        this.getColumnByKey("source").setWidth("210px").setResizable(true);
        this.getColumnByKey("availability").setWidth("90px").setResizable(true);
        this.getColumnByKey("download").setWidth("65px").setResizable(true);
        this.getColumnByKey("select").setWidth("50px").setResizable(true);
		//this.alwaysRecalculateColumnWidths = true;
	}

	/**
	 * @param caption
	 * @param dataSource
	 */
	/*public ResizingTable(String caption, Container dataSource) {
		super(caption, dataSource);
		this.alwaysRecalculateColumnWidths = true;
	}
    */
}
