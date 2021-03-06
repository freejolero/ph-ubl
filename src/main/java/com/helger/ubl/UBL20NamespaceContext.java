/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl;

import javax.annotation.Nonnull;

import com.helger.commons.xml.CXML;
import com.helger.commons.xml.namespace.MapBasedNamespaceContext;

/**
 * The namespace context to be used as the namespace prefix mapper.
 *
 * @author Philip Helger
 */
public class UBL20NamespaceContext extends MapBasedNamespaceContext
{
  private static final class SingletonHolder
  {
    static final UBL20NamespaceContext s_aInstance = new UBL20NamespaceContext ();
  }

  protected UBL20NamespaceContext ()
  {
    addMapping ("xsi", CXML.XML_NS_XSI);
    addMapping ("xs", CXML.XML_NS_XSD);
    addMapping ("cac", CUBL20.XML_SCHEMA_CAC_NAMESPACE_URL);
    addMapping ("cbc", CUBL20.XML_SCHEMA_CBC_NAMESPACE_URL);
    addMapping ("cec", CUBL20.XML_SCHEMA_CEC_NAMESPACE_URL);
  }

  @Nonnull
  public static UBL20NamespaceContext getInstance ()
  {
    return SingletonHolder.s_aInstance;
  }
}
