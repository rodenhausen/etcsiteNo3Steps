package edu.arizona.biosemantics.otolite.client.view.terminfo;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Composite;

import edu.arizona.biosemantics.otolite.client.presenter.terminfo.DictionaryContentPresenter;
import edu.arizona.biosemantics.otolite.shared.beans.terminfo.TermDictionary;

public class DictionaryContentView extends Composite implements
		DictionaryContentPresenter.Display {

	private CellTable<TermDictionary> table;

	public DictionaryContentView() {
		table = new CellTable<TermDictionary>();
		table.setSize("100%", "100%");
		initWidget(table);
	}

	@Override
	public CellTable<TermDictionary> getTbl() {
		return table;
	}

}
