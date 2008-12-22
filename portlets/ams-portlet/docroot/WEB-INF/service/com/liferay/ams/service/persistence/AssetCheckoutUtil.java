/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.ams.service.persistence;

/**
 * <a href="AssetCheckoutUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class AssetCheckoutUtil {
	public static com.liferay.ams.model.AssetCheckout create(
		long assetCheckoutId) {
		return getPersistence().create(assetCheckoutId);
	}

	public static com.liferay.ams.model.AssetCheckout remove(
		long assetCheckoutId)
		throws com.liferay.ams.NoSuchAssetCheckoutException,
			com.liferay.portal.SystemException {
		return getPersistence().remove(assetCheckoutId);
	}

	public static com.liferay.ams.model.AssetCheckout remove(
		com.liferay.ams.model.AssetCheckout assetCheckout)
		throws com.liferay.portal.SystemException {
		return getPersistence().remove(assetCheckout);
	}

	public static com.liferay.ams.model.AssetCheckout update(
		com.liferay.ams.model.AssetCheckout assetCheckout)
		throws com.liferay.portal.SystemException {
		return getPersistence().update(assetCheckout);
	}

	public static com.liferay.ams.model.AssetCheckout update(
		com.liferay.ams.model.AssetCheckout assetCheckout, boolean merge)
		throws com.liferay.portal.SystemException {
		return getPersistence().update(assetCheckout, merge);
	}

	public static com.liferay.ams.model.AssetCheckout updateImpl(
		com.liferay.ams.model.AssetCheckout assetCheckout, boolean merge)
		throws com.liferay.portal.SystemException {
		return getPersistence().updateImpl(assetCheckout, merge);
	}

	public static com.liferay.ams.model.AssetCheckout findByPrimaryKey(
		long assetCheckoutId)
		throws com.liferay.ams.NoSuchAssetCheckoutException,
			com.liferay.portal.SystemException {
		return getPersistence().findByPrimaryKey(assetCheckoutId);
	}

	public static com.liferay.ams.model.AssetCheckout fetchByPrimaryKey(
		long assetCheckoutId) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByPrimaryKey(assetCheckoutId);
	}

	public static java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	public static java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	public static java.util.List<com.liferay.ams.model.AssetCheckout> findAll()
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll();
	}

	public static java.util.List<com.liferay.ams.model.AssetCheckout> findAll(
		int start, int end) throws com.liferay.portal.SystemException {
		return getPersistence().findAll(start, end);
	}

	public static java.util.List<com.liferay.ams.model.AssetCheckout> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll(start, end, obc);
	}

	public static void removeAll() throws com.liferay.portal.SystemException {
		getPersistence().removeAll();
	}

	public static int countAll() throws com.liferay.portal.SystemException {
		return getPersistence().countAll();
	}

	public static void registerListener(
		com.liferay.portal.model.ModelListener listener) {
		getPersistence().registerListener(listener);
	}

	public static void unregisterListener(
		com.liferay.portal.model.ModelListener listener) {
		getPersistence().unregisterListener(listener);
	}

	public static AssetCheckoutPersistence getPersistence() {
		return _persistence;
	}

	public void setPersistence(AssetCheckoutPersistence persistence) {
		_persistence = persistence;
	}

	private static AssetCheckoutPersistence _persistence;
}