package lk.ijse.gdse66;

import lk.ijse.gdse66.repo.StudentRepo;
import lk.ijse.gdse66.repo.impl.RepoFactory;

/**
 * @author : L.H.J
 * @File: Launcher
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class Launcher {
    StudentRepo studentRepo = (StudentRepo) RepoFactory.getInstance().getRepo(RepoFactory.RepoTypes.STUDENT);
    public static void main(String[] args) {

    }
}
