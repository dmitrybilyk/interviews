package toknow.nikita.duplicate.readonly;


/**
 * Stores read-only state of a component and is capable of refreshing it on demand.
 */
public interface ReadOnlyManager {

  /**
   * An instance of ReadOnlyManager for components that are considered always read-only and have no editable parts.
   * These components will not react to {@link #setReadOnly(boolean)} and {@link #isReadOnly()} will always return true.
   */
  public static ReadOnlyManager ALWAYS = new ReadOnlyManager() {
//    @Override
    public boolean isReadOnly() {
      return true;
    }

//    @Override
    public void setReadOnly(boolean readOnly) {
      // ignore - always read-only
    }
  };

  boolean isReadOnly();

  void setReadOnly(boolean readOnly);

}
