package com.yzdev.mobiletest.data.dataSource;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DbDataSource_Impl extends DbDataSource {
  private volatile NoticeDao _noticeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `NoticeTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `author` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `story_id` TEXT NOT NULL, `url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ArchivedNotices` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `author` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `story_id` TEXT NOT NULL, `url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '62cd81a9e68c7bfd3b06a1f8245c153e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `NoticeTable`");
        _db.execSQL("DROP TABLE IF EXISTS `ArchivedNotices`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNoticeTable = new HashMap<String, TableInfo.Column>(6);
        _columnsNoticeTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoticeTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoticeTable.put("author", new TableInfo.Column("author", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoticeTable.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoticeTable.put("story_id", new TableInfo.Column("story_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNoticeTable.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNoticeTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNoticeTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNoticeTable = new TableInfo("NoticeTable", _columnsNoticeTable, _foreignKeysNoticeTable, _indicesNoticeTable);
        final TableInfo _existingNoticeTable = TableInfo.read(_db, "NoticeTable");
        if (! _infoNoticeTable.equals(_existingNoticeTable)) {
          return new RoomOpenHelper.ValidationResult(false, "NoticeTable(com.yzdev.mobiletest.domain.model.entities.NoticeEntity).\n"
                  + " Expected:\n" + _infoNoticeTable + "\n"
                  + " Found:\n" + _existingNoticeTable);
        }
        final HashMap<String, TableInfo.Column> _columnsArchivedNotices = new HashMap<String, TableInfo.Column>(6);
        _columnsArchivedNotices.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArchivedNotices.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArchivedNotices.put("author", new TableInfo.Column("author", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArchivedNotices.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArchivedNotices.put("story_id", new TableInfo.Column("story_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArchivedNotices.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArchivedNotices = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArchivedNotices = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArchivedNotices = new TableInfo("ArchivedNotices", _columnsArchivedNotices, _foreignKeysArchivedNotices, _indicesArchivedNotices);
        final TableInfo _existingArchivedNotices = TableInfo.read(_db, "ArchivedNotices");
        if (! _infoArchivedNotices.equals(_existingArchivedNotices)) {
          return new RoomOpenHelper.ValidationResult(false, "ArchivedNotices(com.yzdev.mobiletest.domain.model.entities.ArchivedNotices).\n"
                  + " Expected:\n" + _infoArchivedNotices + "\n"
                  + " Found:\n" + _existingArchivedNotices);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "62cd81a9e68c7bfd3b06a1f8245c153e", "9b0a6961e52d39e6ec8d148c4851d024");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "NoticeTable","ArchivedNotices");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `NoticeTable`");
      _db.execSQL("DELETE FROM `ArchivedNotices`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(NoticeDao.class, NoticeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public NoticeDao noticeDao() {
    if (_noticeDao != null) {
      return _noticeDao;
    } else {
      synchronized(this) {
        if(_noticeDao == null) {
          _noticeDao = new NoticeDao_Impl(this);
        }
        return _noticeDao;
      }
    }
  }
}
