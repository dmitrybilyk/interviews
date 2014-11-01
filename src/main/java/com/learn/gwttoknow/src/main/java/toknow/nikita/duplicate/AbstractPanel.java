package toknow.nikita.duplicate;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import toknow.nikita.duplicate.i18n.ScorecardConstants;
import toknow.nikita.duplicate.i18n.ScorecardMessages;
import toknow.nikita.duplicate.readonly.ReadOnlyContainerManager;
import toknow.nikita.duplicate.readonly.ReadOnlyManaged;
import toknow.nikita.duplicate.readonly.ReadOnlyManager;
import toknow.server.BaseBean;

/** @author Stanislav Valenta, 4.6.2009 */
public abstract class AbstractPanel extends TabItem implements ReadOnlyManaged {

  protected static final ScorecardConstants i18nConstants = GWT.create(ScorecardConstants.class);
  protected static final ScorecardMessages i18nMessages = GWT.create(ScorecardMessages.class);

  protected final ReadOnlyManager readOnlyManager = new ReadOnlyContainerManager(this);
  protected final GuiFactory guiFactory;
	private final BaseBean baseBean;
	private String closeStatus;


	public AbstractPanel(BaseBean baseBean, GuiFactory guiFactory) {
		super();
		this.baseBean = baseBean;
		this.guiFactory = guiFactory;
		setScrollMode(Scroll.AUTO);
	}

	/**
	 * Creates a new tab item with the given text.
	 * @param text the item's text
	 */
	public AbstractPanel(BaseBean baseBean, GuiFactory guiFactory, String text) {
		super(text);
		this.baseBean = baseBean;
		this.guiFactory = guiFactory;
		setScrollMode(Scroll.AUTO);
	}

	public BaseBean getBO() {
		return baseBean;
	}

	public void setCloseStatus(String closeStatus) {
		this.closeStatus = closeStatus;
	}

	public String getCloseStatus() {
		return closeStatus;
	}

  // todo: patch http://jira:81/browse/SC-1783, this method should be overriden by inheritors in future versions and will be called
  // on active tab or all tabs?, when logout. It might return some state enum instead of boolean
	public void beforeClose(AsyncCallback<Boolean> callback) {
		callback.onSuccess(true);
	}

//  @Override
  public ReadOnlyManager getReadOnlyManager() {
    return readOnlyManager;
  }

	public void setReadOnly(boolean readOnly) {
		readOnlyManager.setReadOnly(readOnly);
	}

  public boolean isReadOnly() {
		return readOnlyManager.isReadOnly();
	}

  // everytime the panel is switched
	@Override
	protected void onShow() {
		super.onShow();
    setReadOnly(isReadOnly()); // make panel readonly when switching tabs (refresh and similar events)...
	}

  // for the first time the panel is created
  @Override
  protected void onRender(Element target, int index) {
    super.onRender(target, index);
    setReadOnly(isReadOnly());
  }

  protected native void downloadExportedFile(String url) /*-{
      window.open(url)
  }-*/;


}
