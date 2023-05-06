package com.chengma.common;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author psh
 * @date 2023/4/12 19:18
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R<T> {

	public static final int SUCCESS_CODE = 200;

	public static final String SUCCESS_MESSAGE = "Success";

	private static final long serialVersionUID = 141323L;

	private int code;

	private String message;

	private T data;

	public static <T> R<T> ok() {
		return ok(null);
	}

	public static <T> R<T> ok(T data) {
		return new R<T>().setCode(SUCCESS_CODE).setData(data).setMessage(SUCCESS_MESSAGE);
	}

	public static <T> R<T> ok(T data, String message) {
		return new R<T>().setCode(SUCCESS_CODE).setData(data).setMessage(message);
	}

	public static <T> R<T> failed(int code, String message) {
		return new R<T>().setCode(code).setMessage(message);
	}

}
