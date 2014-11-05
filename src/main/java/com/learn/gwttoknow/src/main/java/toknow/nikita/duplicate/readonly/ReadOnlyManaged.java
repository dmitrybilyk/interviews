package toknow.nikita.duplicate.readonly;


/**
 * An interface for any component or container to implement
 * if they want to be directly responsible for setting read-only state on themselves and their children.
 *
 */
public interface ReadOnlyManaged {

  /**
   * @return the manager that is managing read-only state of this component
   */
  ReadOnlyManager getReadOnlyManager();
}
