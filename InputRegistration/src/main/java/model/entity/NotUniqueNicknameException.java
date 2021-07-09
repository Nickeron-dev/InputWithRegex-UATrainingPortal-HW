package model.entity;

/**
 * Exception that is thrown when nickname is not unique
 * @author Illia Koshkin
 */
public class NotUniqueNicknameException extends Exception {

    public NotUniqueNicknameException(String message) {
        super(message);
    }

}
