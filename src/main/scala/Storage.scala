package fprefactoring.storage

trait Storage[A] {
  def flush(a: A): Unit
}
