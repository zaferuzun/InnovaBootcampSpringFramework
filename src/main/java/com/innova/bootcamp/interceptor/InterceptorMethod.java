package com.innova.bootcamp.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorInterface
@Interceptor
public class InterceptorMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {

		System.out.println("önceki durumum " + context.getMethod().getName() + " " + context.getClass());

		boolean isDatabase = false;
		Object isContinue = null;
		if (isDatabase) {
			System.out.println("Mysql konfigürasyonlarını yapınız !!! Mysql sayfasına yönlendiriliyorsunuz");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println(" Seçim yapıldı : Yönlendirme yapılıyor Oracle konfigürasyonlarına yönlendiriliyorsunuz");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
}
