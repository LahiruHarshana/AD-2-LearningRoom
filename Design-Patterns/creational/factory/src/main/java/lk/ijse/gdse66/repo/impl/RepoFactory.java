package lk.ijse.gdse66.repo.impl;

import lk.ijse.gdse66.repo.SuperRepo;

/**
 * @author : L.H.J
 * @File: RepoFactory
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-09, Thursday
 **/
public class RepoFactory {
private static RepoFactory repoFactory;

    private RepoFactory() {
    }

    public static RepoFactory getInstance() {
        return (repoFactory == null) ? (repoFactory = new RepoFactory()) : (repoFactory);
    }

    public enum RepoTypes {
        CUSTOMER, STUDENT
    }

    public SuperRepo getRepo(RepoTypes repoTypes) {
        switch (repoTypes) {
            case CUSTOMER:
                return new CustomerRepoImpl();
            case STUDENT:
                return new StudentRepoImpl();
            default:
                return null;
        }
    }

}
