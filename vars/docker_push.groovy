def_call(String dockerhub user, string docker  
         withCredentials([usernamePassword(crentialsId: 'dockerhubcred', passwordVariable: 'password',usernameVariable: 'username)])
         sh "docker login -u $(dockerhubuser} -p $(dockerhubpass)"
                                           
