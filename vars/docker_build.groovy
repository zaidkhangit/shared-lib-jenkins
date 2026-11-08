def call(String Dockeruser , String Imagetag, projectname)
{
  sh "docker build -t $(Dockeruser)/$(projectname):$(Imagetag) ."
}
