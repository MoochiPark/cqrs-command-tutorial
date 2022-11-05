db.createUser(
  {
    user: "moochi",
    pwd: "moochitest",
    roles: [
      {role: "readWrite", db: "sensing-data"}
    ]
  }
);
db.createCollection("sensing-data");
