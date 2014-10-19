package toknow.server;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public enum Dao {
  INSTANCE;

  public List<Todo> listTodos() {
    EntityManager em = EMFService.get().createEntityManager();
    // read the existing entries
    Query q = em.createQuery("select m from Todo m");
    List<Todo> todos = q.getResultList();
    return todos;
  }

  public void add(String userId, String summary, String description,
      String url) {
    synchronized (this) {
      EntityManager em = EMFService.get().createEntityManager();
      Todo todo = new Todo(userId, summary, description, url);
      em.persist(todo);
      em.close();
    }
  }

  public List<Todo> getTodos(String userId) {
    EntityManager em = EMFService.get().createEntityManager();
    Query q = em
        .createQuery("select t from Todo t where t.author = :userId");
    q.setParameter("userId", userId);
    List<Todo> todos = q.getResultList();
    return todos;
  }

  public void remove(long id) {
    EntityManager em = EMFService.get().createEntityManager();
    try {
      Todo todo = em.find(Todo.class, id);
      em.remove(todo);
    } finally {
      em.close();
    }
  }
} 