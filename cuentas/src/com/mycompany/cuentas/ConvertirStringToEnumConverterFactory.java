package com.mycompany.cuentas;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ConvertirStringToEnumConverterFactory implements ConverterFactory<String, Enum>  {

	 
	public <T extends Enum> Converter<String, T> getConverter(Class<T> arg0) {
		return new StringToEnum<>(arg0);
	}
 
	
	private final class StringToEnum<T extends Enum> implements Converter<String, T> {
        private Class<T> enumType;
		
        public StringToEnum(Class<T> enumType) {
            this.enumType = enumType;
        }
		public T convert(String source) {
            return (T) Enum.valueOf(this.enumType, source.trim());
        }
    }
	
	
}
