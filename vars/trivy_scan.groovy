def call(){
  sh "trivy fs . --parallel=1"
}
